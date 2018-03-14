/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MISSION_REQUEST PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Request the information of the mission item with the sequence number seq. The response of the system to this message should be a MISSION_ITEM message. http://qgroundcontrol.org/mavlink/waypoint_protocol
 */
public class msg_mission_request extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MISSION_REQUEST = 40;
    public static final int MAVLINK_MSG_LENGTH = 5;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MISSION_REQUEST;


    /**
     * Sequence
     */
    public int seq;

    /**
     * System ID
     */
    public short target_system;

    /**
     * Component ID
     */
    public short target_component;

    /**
     * Mission type, see MAV_MISSION_TYPE
     */
    public short mission_type;


    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MISSION_REQUEST;

        packet.payload.putUnsignedShort(seq);

        packet.payload.putUnsignedByte(target_system);

        packet.payload.putUnsignedByte(target_component);

        packet.payload.putUnsignedByte(mission_type);

        return packet;
    }

    /**
     * Decode a mission_request message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.seq = payload.getUnsignedShort();

        this.target_system = payload.getUnsignedByte();

        this.target_component = payload.getUnsignedByte();

        this.mission_type = payload.getUnsignedByte();

    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mission_request() {
        msgid = MAVLINK_MSG_ID_MISSION_REQUEST;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_mission_request(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_MISSION_REQUEST;
        unpack(mavLinkPacket.payload);
    }


    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_MISSION_REQUEST - sysid:" + sysid + " compid:" + compid + " seq:" + seq + " target_system:" + target_system + " target_component:" + target_component + " mission_type:" + mission_type + "";
    }
}
        