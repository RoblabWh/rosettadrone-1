/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SAFETY_ALLOWED_AREA PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Read out the safety zone the MAV currently assumes.
 */
public class msg_safety_allowed_area extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SAFETY_ALLOWED_AREA = 55;
    public static final int MAVLINK_MSG_LENGTH = 25;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SAFETY_ALLOWED_AREA;


    /**
     * x position 1 / Latitude 1
     */
    public float p1x;

    /**
     * y position 1 / Longitude 1
     */
    public float p1y;

    /**
     * z position 1 / Altitude 1
     */
    public float p1z;

    /**
     * x position 2 / Latitude 2
     */
    public float p2x;

    /**
     * y position 2 / Longitude 2
     */
    public float p2y;

    /**
     * z position 2 / Altitude 2
     */
    public float p2z;

    /**
     * Coordinate frame, as defined by MAV_FRAME enum in mavlink_types.h. Can be either global, GPS, right-handed with Z axis up or local, right handed, Z axis down.
     */
    public short frame;


    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SAFETY_ALLOWED_AREA;

        packet.payload.putFloat(p1x);

        packet.payload.putFloat(p1y);

        packet.payload.putFloat(p1z);

        packet.payload.putFloat(p2x);

        packet.payload.putFloat(p2y);

        packet.payload.putFloat(p2z);

        packet.payload.putUnsignedByte(frame);

        return packet;
    }

    /**
     * Decode a safety_allowed_area message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.p1x = payload.getFloat();

        this.p1y = payload.getFloat();

        this.p1z = payload.getFloat();

        this.p2x = payload.getFloat();

        this.p2y = payload.getFloat();

        this.p2z = payload.getFloat();

        this.frame = payload.getUnsignedByte();

    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_safety_allowed_area() {
        msgid = MAVLINK_MSG_ID_SAFETY_ALLOWED_AREA;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_safety_allowed_area(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_SAFETY_ALLOWED_AREA;
        unpack(mavLinkPacket.payload);
    }


    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_SAFETY_ALLOWED_AREA - sysid:" + sysid + " compid:" + compid + " p1x:" + p1x + " p1y:" + p1y + " p1z:" + p1z + " p2x:" + p2x + " p2y:" + p2y + " p2z:" + p2z + " frame:" + frame + "";
    }
}
        