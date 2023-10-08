
package net.ivnogood.maythings.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.ivnogood.maythings.world.inventory.BlackmarketMenu;
import net.ivnogood.maythings.network.BlackmarketButtonMessage;
import net.ivnogood.maythings.CoolthingsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BlackmarketScreen extends AbstractContainerScreen<BlackmarketMenu> {
	private final static HashMap<String, Object> guistate = BlackmarketMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Cheat;

	public BlackmarketScreen(BlackmarketMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 175;
	}

	private static final ResourceLocation texture = new ResourceLocation("coolthings:textures/blackmarket.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		Cheat.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (Cheat.isFocused())
			return Cheat.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Cheat.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Black Market", 58, 5, -16777216);
		this.font.draw(poseStack, "Put any block/Item you want", 20, 36, -16777216);
		this.font.draw(poseStack, "3 diamond blocks", 48, 70, -16724788);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		Cheat = new EditBox(this.font, this.leftPos + 25, this.topPos + 16, 120, 20, new TextComponent(""));
		guistate.put("text:Cheat", Cheat);
		Cheat.setMaxLength(32767);
		this.addWidget(this.Cheat);
		this.addRenderableWidget(new Button(this.leftPos + 70, this.topPos + 50, 30, 20, new TextComponent("BUY"), e -> {
			if (true) {
				CoolthingsMod.PACKET_HANDLER.sendToServer(new BlackmarketButtonMessage(0, x, y, z));
				BlackmarketButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
