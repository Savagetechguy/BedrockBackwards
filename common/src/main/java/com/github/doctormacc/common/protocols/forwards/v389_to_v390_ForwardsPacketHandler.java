package com.github.doctormacc.common.protocols.forwards;

import com.github.doctormacc.common.PlayerSession;
import com.nukkitx.protocol.bedrock.BedrockPacket;

public class v389_to_v390_ForwardsPacketHandler extends ForwardsPacketHandler {

    @Override
    public boolean translate(PlayerSession session, BedrockPacket packet, boolean fromUpstream, int translatorIndex) {
        return true;
    }
}
