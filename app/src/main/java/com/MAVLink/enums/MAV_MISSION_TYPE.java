/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * Type of mission items being requested/sent in mission protocol.
 */
public class MAV_MISSION_TYPE {
    public static final int MAV_MISSION_TYPE_MISSION = 0; /* Items are mission commands for main mission. | */
    public static final int MAV_MISSION_TYPE_FENCE = 1; /* Specifies GeoFence area(s). Items are MAV_CMD_FENCE_ GeoFence items. | */
    public static final int MAV_MISSION_TYPE_RALLY = 2; /* Specifies the rally points for the vehicle. Rally points are alternative RTL points. Items are MAV_CMD_RALLY_POINT rally point items. | */
    public static final int MAV_MISSION_TYPE_ALL = 255; /* Only used in MISSION_CLEAR_ALL to clear all mission types. | */
    public static final int MAV_MISSION_TYPE_ENUM_END = 256; /*  | */
}
            