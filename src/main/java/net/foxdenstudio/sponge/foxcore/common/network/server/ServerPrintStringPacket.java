package net.foxdenstudio.sponge.foxcore.common.network.server;

import io.netty.buffer.ByteBuf;
import net.foxdenstudio.sponge.foxcore.common.network.IServerPacket;
import net.foxdenstudio.sponge.foxcore.mod.FoxCoreForgeMain;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import org.spongepowered.api.network.ChannelBuf;

/**
 * Created by Fox on 4/18/2016.
 */
public class ServerPrintStringPacket implements IServerPacket {

    private final String[] toPrint;

    public ServerPrintStringPacket(String... toPrint) {
        this.toPrint = toPrint;
    }

    @Override
    public void read(ByteBuf payload) {
        while (payload.isReadable()) {
            FoxCoreForgeMain.logger.info(ByteBufUtils.readUTF8String(payload));
        }
    }

    @Override
    public void write(ChannelBuf buf) {
        for (String str : toPrint)
            buf.writeString(str);
    }

}
