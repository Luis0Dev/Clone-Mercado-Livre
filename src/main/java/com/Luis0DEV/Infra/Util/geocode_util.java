package com.Luis0DEV.Infra.Util;

import java.util.logging.Logger;

public class geocode_util {

    private static final Logger LOG = Logger.getLogger(geocode_util.class.getName());
    private static final double R = 6371;

    public static double haversine(double latitude_x, double longitude_x, double latitude_y, double longitude_y) {

        double dLat = Math.toRadians(latitude_y - latitude_x);
        double dLon = Math.toRadians(longitude_y - longitude_x);

        latitude_x = Math.toRadians(latitude_x);
        latitude_y= Math.toRadians(latitude_y);

        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.pow(Math.sin(dLon / 2), 2) * Math.cos(latitude_x) * Math.cos(latitude_y);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double dist = R * c;

        return dist;
    }
}
