package net.nevermine.skill.foraging;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class foragingMessage implements IMessage {
	private int value;
	private int percent;

	public foragingMessage() {
	}

	public foragingMessage(final int level, final int per) {
		value = level;
		percent = per;
	}

	public void fromBytes(final ByteBuf buf) {
		value = buf.readInt();
		percent = buf.readInt();
	}

	public void toBytes(final ByteBuf buf) {
		buf.writeInt(value);
		buf.writeInt(percent);
	}

	public static class Handler implements IMessageHandler<foragingMessage, IMessage> {
		public IMessage onMessage(final foragingMessage msg, final MessageContext ctx) {
			foragingRenderer.value = msg.value;
			foragingRenderer.percent = msg.percent;
			return null;
		}
	}
}
