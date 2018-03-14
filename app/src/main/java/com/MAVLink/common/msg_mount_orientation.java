/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE MOUNT_ORIENTATION PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * WIP: Orientation of a mount
 */
public class msg_mount_orientation extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_MOUNT_ORIENTATION = 265;
    public static final int MAVLINK_MSG_LENGTH = 16;
    private static final long serialVersionUID = MAVLINK_MSG_ID_MOUNT_ORIENTATION;


    /**
     * Timestamp (milliseconds since system boot)
     */
    public long time_boot_ms;

    /**
     * Roll in degrees
     */
    public float roll;

    /**
     * Pitch in degrees
     */
    public float pitch;

    /**
     * Yaw in degrees
     */
    public float yaw;


    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_MOUNT_ORIENTATION;

        packet.payload.putUnsignedInt(time_boot_ms);

        packet.payload.putFloat(roll);

        packet.payload.putFloat(pitch);

        packet.payload.putFloat(yaw);

        return packet;
    }

    /**
     * Decode a mount_orientation message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();

        this.roll = payload.getFloat();

        this.pitch = payload.getFloat();

        this.yaw = payload.getFloat();

    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_mount_orientation() {
        msgid = MAVLINK_MSG_ID_MOUNT_ORIENTATION;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_mount_orientation(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_MOUNT_ORIENTATION;
        unpack(mavLinkPacket.payload);
    }


    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_MOUNT_ORIENTATION - sysid:" + sysid + " compid:" + compid + " time_boot_ms:" + time_boot_ms + " roll:" + roll + " pitch:" + pitch + " yaw:" + yaw + "";
    }
}
        