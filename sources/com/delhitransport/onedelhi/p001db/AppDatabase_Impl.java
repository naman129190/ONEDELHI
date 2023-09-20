package com.delhitransport.onedelhi.p001db;

import androidx.room.C0967c;
import com.onedelhi.secure.C2629kf;
import com.onedelhi.secure.ae0;
import com.onedelhi.secure.an3;
import com.onedelhi.secure.eo3;
import com.onedelhi.secure.fj2;
import com.onedelhi.secure.fo3;
import com.onedelhi.secure.m94;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n74;
import com.onedelhi.secure.o74;
import com.onedelhi.secure.vc0;
import com.onedelhi.secure.ym3;
import com.onedelhi.secure.zm3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.delhitransport.onedelhi.db.AppDatabase_Impl */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile BookingDao _bookingDao;
    private volatile DirectionsStopDao _directionsStopDao;
    private volatile EVSearchDao _eVSearchDao;
    private volatile EvAllSearchDao _evAllSearchDao;
    private volatile PastTripPlannerSearchDao _pastTripPlannerSearchDao;
    private volatile RouteSearchDao _routeSearchDao;
    private volatile eo3 _routesDao;
    private volatile StopsDao _stopsDao;
    private volatile TicketDao _ticketDao;

    public StopsDao allStopsDao() {
        StopsDao stopsDao;
        if (this._stopsDao != null) {
            return this._stopsDao;
        }
        synchronized (this) {
            if (this._stopsDao == null) {
                this._stopsDao = new StopsDao_Impl(this);
            }
            stopsDao = this._stopsDao;
        }
        return stopsDao;
    }

    public BookingDao bookingDao() {
        BookingDao bookingDao;
        if (this._bookingDao != null) {
            return this._bookingDao;
        }
        synchronized (this) {
            if (this._bookingDao == null) {
                this._bookingDao = new BookingDao_Impl(this);
            }
            bookingDao = this._bookingDao;
        }
        return bookingDao;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        n74 x = super.getOpenHelper().mo13235x();
        try {
            super.beginTransaction();
            x.mo18303G("DELETE FROM `UserTickets`");
            x.mo18303G("DELETE FROM `UserBookings`");
            x.mo18303G("DELETE FROM `EVSearches`");
            x.mo18303G("DELETE FROM `RouteSearches`");
            x.mo18303G("DELETE FROM `AllStops`");
            x.mo18303G("DELETE FROM `AllRoutes`");
            x.mo18303G("DELETE FROM `EvAllSearch`");
            x.mo18303G("DELETE FROM `PastSearchTripPlanner`");
            x.mo18303G("DELETE FROM `Stops`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            x.mo18327g1("PRAGMA wal_checkpoint(FULL)").close();
            if (!x.mo18332n2()) {
                x.mo18303G("VACUUM");
            }
        }
    }

    public C0967c createInvalidationTracker() {
        return new C0967c(this, new HashMap(0), new HashMap(0), "UserTickets", "UserBookings", "EVSearches", "RouteSearches", "AllStops", "AllRoutes", "EvAllSearch", "PastSearchTripPlanner", "Stops");
    }

    public o74 createOpenHelper(ae0 ae0) {
        return ae0.f9016a.mo13792a(o74.C3037b.m23597a(ae0.f9014a).mo21829c(ae0.f9021a).mo21828b(new an3(ae0, new an3.C1723a(6) {
            public void createAllTables(n74 n74) {
                n74.mo18303G("CREATE TABLE IF NOT EXISTS `UserTickets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `message` TEXT, `bus_number` TEXT, `ticket_id` TEXT, `booking_id` TEXT, `fare` REAL NOT NULL, `bus_route_long_name` TEXT, `bus_agency` TEXT, `booking_time` TEXT, `validity` TEXT, `description` TEXT, `total_fare` REAL NOT NULL, `ticket_count` INTEGER NOT NULL, `fare_per_ticket` REAL NOT NULL, `validity_stop_index` INTEGER NOT NULL, `transaction_type` INTEGER NOT NULL, `transaction_status` TEXT, `category` TEXT, `ticket_start_stop_name` TEXT, `ticket_start_stop_index` INTEGER NOT NULL, `ticket_end_stop_name` TEXT, `ticket_end_stop_index` INTEGER NOT NULL, `amount_payable_by_user` REAL NOT NULL, `is_ac` INTEGER NOT NULL)");
                n74.mo18303G("CREATE UNIQUE INDEX IF NOT EXISTS `index_UserTickets_ticket_id` ON `UserTickets` (`ticket_id`)");
                n74.mo18303G("CREATE TABLE IF NOT EXISTS `UserBookings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `message` TEXT, `route_long_name` TEXT, `start_stop_index` INTEGER NOT NULL, `start_stop_name` TEXT, `booking_id` TEXT, `bus_agency` TEXT, `is_ac` INTEGER NOT NULL, `description` TEXT, `route_termination_stop` TEXT, `postpaid` INTEGER NOT NULL)");
                n74.mo18303G("CREATE UNIQUE INDEX IF NOT EXISTS `index_UserBookings_booking_id` ON `UserBookings` (`booking_id`)");
                n74.mo18303G("CREATE TABLE IF NOT EXISTS `EVSearches` (`id` TEXT NOT NULL, `name` TEXT, `address` TEXT, PRIMARY KEY(`id`))");
                n74.mo18303G("CREATE INDEX IF NOT EXISTS `index_EVSearches_name` ON `EVSearches` (`name`)");
                n74.mo18303G("CREATE TABLE IF NOT EXISTS `RouteSearches` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `route_name` TEXT, `source` TEXT, `terminal` TEXT, `type` TEXT)");
                n74.mo18303G("CREATE UNIQUE INDEX IF NOT EXISTS `index_RouteSearches_route_name` ON `RouteSearches` (`route_name`)");
                n74.mo18303G("CREATE TABLE IF NOT EXISTS `AllStops` (`id` INTEGER NOT NULL, `latitude` REAL, `longitude` REAL, `name` TEXT, `next_stop` TEXT, `stop_type` TEXT NOT NULL, PRIMARY KEY(`id`))");
                n74.mo18303G("CREATE TABLE IF NOT EXISTS `AllRoutes` (`id` TEXT NOT NULL, `route` TEXT, `short_name` TEXT, `long_name` TEXT, `end` TEXT, `start` TEXT, `direction` TEXT, PRIMARY KEY(`id`))");
                n74.mo18303G("CREATE TABLE IF NOT EXISTS `EvAllSearch` (`name` TEXT, `id` TEXT NOT NULL, `address` TEXT, PRIMARY KEY(`id`))");
                n74.mo18303G("CREATE TABLE IF NOT EXISTS `PastSearchTripPlanner` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `stop_id` INTEGER NOT NULL, `stop_name` TEXT, `stop_type` TEXT, `stop_desc` TEXT DEFAULT '', `count` INTEGER NOT NULL, `stop_lat` REAL, `stop_lon` REAL)");
                n74.mo18303G("CREATE INDEX IF NOT EXISTS `index_PastSearchTripPlanner_stop_type` ON `PastSearchTripPlanner` (`stop_type`)");
                n74.mo18303G("CREATE TABLE IF NOT EXISTS `Stops` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `stop_id` INTEGER NOT NULL, `name` TEXT, `lat` REAL NOT NULL, `lon` REAL NOT NULL, `stop_type` TEXT, `stop_desc` TEXT, `cluster_id` INTEGER NOT NULL DEFAULT -1)");
                n74.mo18303G("CREATE UNIQUE INDEX IF NOT EXISTS `index_Stops_stop_id_stop_type` ON `Stops` (`stop_id`, `stop_type`)");
                n74.mo18303G("CREATE INDEX IF NOT EXISTS `index_Stops_stop_type` ON `Stops` (`stop_type`)");
                n74.mo18303G(zm3.f23823f);
                n74.mo18303G("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd49b1cc67cebd3683f4cd469e21ffb31')");
            }

            public void dropAllTables(n74 n74) {
                n74.mo18303G("DROP TABLE IF EXISTS `UserTickets`");
                n74.mo18303G("DROP TABLE IF EXISTS `UserBookings`");
                n74.mo18303G("DROP TABLE IF EXISTS `EVSearches`");
                n74.mo18303G("DROP TABLE IF EXISTS `RouteSearches`");
                n74.mo18303G("DROP TABLE IF EXISTS `AllStops`");
                n74.mo18303G("DROP TABLE IF EXISTS `AllRoutes`");
                n74.mo18303G("DROP TABLE IF EXISTS `EvAllSearch`");
                n74.mo18303G("DROP TABLE IF EXISTS `PastSearchTripPlanner`");
                n74.mo18303G("DROP TABLE IF EXISTS `Stops`");
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((ym3.C4012b) AppDatabase_Impl.this.mCallbacks.get(i)).mo27635b(n74);
                    }
                }
            }

            public void onCreate(n74 n74) {
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((ym3.C4012b) AppDatabase_Impl.this.mCallbacks.get(i)).mo27634a(n74);
                    }
                }
            }

            public void onOpen(n74 n74) {
                n74 unused = AppDatabase_Impl.this.mDatabase = n74;
                AppDatabase_Impl.this.internalInitInvalidationTracker(n74);
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((ym3.C4012b) AppDatabase_Impl.this.mCallbacks.get(i)).mo27636c(n74);
                    }
                }
            }

            public void onPostMigrate(n74 n74) {
            }

            public void onPreMigrate(n74 n74) {
                vc0.m29989b(n74);
            }

            public an3.C1724b onValidateSchema(n74 n74) {
                n74 n742 = n74;
                HashMap hashMap = new HashMap(24);
                hashMap.put("id", new m94.C2838a("id", "INTEGER", true, 1, (String) null, 1));
                hashMap.put("message", new m94.C2838a("message", "TEXT", false, 0, (String) null, 1));
                hashMap.put("bus_number", new m94.C2838a("bus_number", "TEXT", false, 0, (String) null, 1));
                hashMap.put("ticket_id", new m94.C2838a("ticket_id", "TEXT", false, 0, (String) null, 1));
                hashMap.put("booking_id", new m94.C2838a("booking_id", "TEXT", false, 0, (String) null, 1));
                hashMap.put("fare", new m94.C2838a("fare", "REAL", true, 0, (String) null, 1));
                hashMap.put("bus_route_long_name", new m94.C2838a("bus_route_long_name", "TEXT", false, 0, (String) null, 1));
                hashMap.put("bus_agency", new m94.C2838a("bus_agency", "TEXT", false, 0, (String) null, 1));
                hashMap.put("booking_time", new m94.C2838a("booking_time", "TEXT", false, 0, (String) null, 1));
                hashMap.put("validity", new m94.C2838a("validity", "TEXT", false, 0, (String) null, 1));
                hashMap.put("description", new m94.C2838a("description", "TEXT", false, 0, (String) null, 1));
                hashMap.put("total_fare", new m94.C2838a("total_fare", "REAL", true, 0, (String) null, 1));
                hashMap.put("ticket_count", new m94.C2838a("ticket_count", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("fare_per_ticket", new m94.C2838a("fare_per_ticket", "REAL", true, 0, (String) null, 1));
                hashMap.put("validity_stop_index", new m94.C2838a("validity_stop_index", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("transaction_type", new m94.C2838a("transaction_type", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("transaction_status", new m94.C2838a("transaction_status", "TEXT", false, 0, (String) null, 1));
                hashMap.put("category", new m94.C2838a("category", "TEXT", false, 0, (String) null, 1));
                hashMap.put("ticket_start_stop_name", new m94.C2838a("ticket_start_stop_name", "TEXT", false, 0, (String) null, 1));
                hashMap.put("ticket_start_stop_index", new m94.C2838a("ticket_start_stop_index", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("ticket_end_stop_name", new m94.C2838a("ticket_end_stop_name", "TEXT", false, 0, (String) null, 1));
                hashMap.put("ticket_end_stop_index", new m94.C2838a("ticket_end_stop_index", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("amount_payable_by_user", new m94.C2838a("amount_payable_by_user", "REAL", true, 0, (String) null, 1));
                hashMap.put("is_ac", new m94.C2838a("is_ac", "INTEGER", true, 0, (String) null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new m94.C2841d("index_UserTickets_ticket_id", true, Arrays.asList(new String[]{"ticket_id"}), Arrays.asList(new String[]{"ASC"})));
                m94 m94 = new m94("UserTickets", hashMap, hashSet, hashSet2);
                m94 a = m94.m21372a(n742, "UserTickets");
                if (!m94.equals(a)) {
                    return new an3.C1724b(false, "UserTickets(com.delhitransport.onedelhi.db.UserTickets).\n Expected:\n" + m94 + "\n Found:\n" + a);
                }
                HashMap hashMap2 = new HashMap(11);
                hashMap2.put("id", new m94.C2838a("id", "INTEGER", true, 1, (String) null, 1));
                hashMap2.put("message", new m94.C2838a("message", "TEXT", false, 0, (String) null, 1));
                hashMap2.put("route_long_name", new m94.C2838a("route_long_name", "TEXT", false, 0, (String) null, 1));
                hashMap2.put("start_stop_index", new m94.C2838a("start_stop_index", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("start_stop_name", new m94.C2838a("start_stop_name", "TEXT", false, 0, (String) null, 1));
                hashMap2.put("booking_id", new m94.C2838a("booking_id", "TEXT", false, 0, (String) null, 1));
                hashMap2.put("bus_agency", new m94.C2838a("bus_agency", "TEXT", false, 0, (String) null, 1));
                hashMap2.put("is_ac", new m94.C2838a("is_ac", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("description", new m94.C2838a("description", "TEXT", false, 0, (String) null, 1));
                hashMap2.put("route_termination_stop", new m94.C2838a("route_termination_stop", "TEXT", false, 0, (String) null, 1));
                hashMap2.put("postpaid", new m94.C2838a("postpaid", "INTEGER", true, 0, (String) null, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new m94.C2841d("index_UserBookings_booking_id", true, Arrays.asList(new String[]{"booking_id"}), Arrays.asList(new String[]{"ASC"})));
                m94 m942 = new m94("UserBookings", hashMap2, hashSet3, hashSet4);
                m94 a2 = m94.m21372a(n742, "UserBookings");
                if (!m942.equals(a2)) {
                    return new an3.C1724b(false, "UserBookings(com.delhitransport.onedelhi.db.UserBookings).\n Expected:\n" + m942 + "\n Found:\n" + a2);
                }
                HashMap hashMap3 = new HashMap(3);
                hashMap3.put("id", new m94.C2838a("id", "TEXT", true, 1, (String) null, 1));
                hashMap3.put("name", new m94.C2838a("name", "TEXT", false, 0, (String) null, 1));
                hashMap3.put("address", new m94.C2838a("address", "TEXT", false, 0, (String) null, 1));
                HashSet hashSet5 = new HashSet(0);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new m94.C2841d("index_EVSearches_name", false, Arrays.asList(new String[]{"name"}), Arrays.asList(new String[]{"ASC"})));
                m94 m943 = new m94("EVSearches", hashMap3, hashSet5, hashSet6);
                m94 a3 = m94.m21372a(n742, "EVSearches");
                if (!m943.equals(a3)) {
                    return new an3.C1724b(false, "EVSearches(com.delhitransport.onedelhi.db.EVSearches).\n Expected:\n" + m943 + "\n Found:\n" + a3);
                }
                HashMap hashMap4 = new HashMap(5);
                hashMap4.put("id", new m94.C2838a("id", "INTEGER", true, 1, (String) null, 1));
                hashMap4.put("route_name", new m94.C2838a("route_name", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("source", new m94.C2838a("source", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("terminal", new m94.C2838a("terminal", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("type", new m94.C2838a("type", "TEXT", false, 0, (String) null, 1));
                HashSet hashSet7 = new HashSet(0);
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new m94.C2841d("index_RouteSearches_route_name", true, Arrays.asList(new String[]{"route_name"}), Arrays.asList(new String[]{"ASC"})));
                m94 m944 = new m94("RouteSearches", hashMap4, hashSet7, hashSet8);
                m94 a4 = m94.m21372a(n742, "RouteSearches");
                if (!m944.equals(a4)) {
                    return new an3.C1724b(false, "RouteSearches(com.delhitransport.onedelhi.db.RouteSearches).\n Expected:\n" + m944 + "\n Found:\n" + a4);
                }
                HashMap hashMap5 = new HashMap(6);
                hashMap5.put("id", new m94.C2838a("id", "INTEGER", true, 1, (String) null, 1));
                hashMap5.put("latitude", new m94.C2838a("latitude", "REAL", false, 0, (String) null, 1));
                hashMap5.put("longitude", new m94.C2838a("longitude", "REAL", false, 0, (String) null, 1));
                hashMap5.put("name", new m94.C2838a("name", "TEXT", false, 0, (String) null, 1));
                hashMap5.put("next_stop", new m94.C2838a("next_stop", "TEXT", false, 0, (String) null, 1));
                hashMap5.put("stop_type", new m94.C2838a("stop_type", "TEXT", true, 0, (String) null, 1));
                m94 m945 = new m94("AllStops", hashMap5, new HashSet(0), new HashSet(0));
                m94 a5 = m94.m21372a(n742, "AllStops");
                if (!m945.equals(a5)) {
                    return new an3.C1724b(false, "AllStops(com.delhitransport.onedelhi.data.AllStops).\n Expected:\n" + m945 + "\n Found:\n" + a5);
                }
                HashMap hashMap6 = new HashMap(7);
                hashMap6.put("id", new m94.C2838a("id", "TEXT", true, 1, (String) null, 1));
                hashMap6.put("route", new m94.C2838a("route", "TEXT", false, 0, (String) null, 1));
                hashMap6.put("short_name", new m94.C2838a("short_name", "TEXT", false, 0, (String) null, 1));
                hashMap6.put("long_name", new m94.C2838a("long_name", "TEXT", false, 0, (String) null, 1));
                hashMap6.put("end", new m94.C2838a("end", "TEXT", false, 0, (String) null, 1));
                hashMap6.put("start", new m94.C2838a("start", "TEXT", false, 0, (String) null, 1));
                hashMap6.put("direction", new m94.C2838a("direction", "TEXT", false, 0, (String) null, 1));
                m94 m946 = new m94("AllRoutes", hashMap6, new HashSet(0), new HashSet(0));
                m94 a6 = m94.m21372a(n742, "AllRoutes");
                if (!m946.equals(a6)) {
                    return new an3.C1724b(false, "AllRoutes(com.delhitransport.onedelhi.data.AllRoutes).\n Expected:\n" + m946 + "\n Found:\n" + a6);
                }
                HashMap hashMap7 = new HashMap(3);
                hashMap7.put("name", new m94.C2838a("name", "TEXT", false, 0, (String) null, 1));
                hashMap7.put("id", new m94.C2838a("id", "TEXT", true, 1, (String) null, 1));
                hashMap7.put("address", new m94.C2838a("address", "TEXT", false, 0, (String) null, 1));
                m94 m947 = new m94("EvAllSearch", hashMap7, new HashSet(0), new HashSet(0));
                m94 a7 = m94.m21372a(n742, "EvAllSearch");
                if (!m947.equals(a7)) {
                    return new an3.C1724b(false, "EvAllSearch(com.delhitransport.onedelhi.db.EvAllSearch).\n Expected:\n" + m947 + "\n Found:\n" + a7);
                }
                HashMap hashMap8 = new HashMap(8);
                hashMap8.put("id", new m94.C2838a("id", "INTEGER", true, 1, (String) null, 1));
                hashMap8.put("stop_id", new m94.C2838a("stop_id", "INTEGER", true, 0, (String) null, 1));
                hashMap8.put("stop_name", new m94.C2838a("stop_name", "TEXT", false, 0, (String) null, 1));
                hashMap8.put("stop_type", new m94.C2838a("stop_type", "TEXT", false, 0, (String) null, 1));
                hashMap8.put("stop_desc", new m94.C2838a("stop_desc", "TEXT", false, 0, "''", 1));
                hashMap8.put("count", new m94.C2838a("count", "INTEGER", true, 0, (String) null, 1));
                hashMap8.put("stop_lat", new m94.C2838a("stop_lat", "REAL", false, 0, (String) null, 1));
                hashMap8.put("stop_lon", new m94.C2838a("stop_lon", "REAL", false, 0, (String) null, 1));
                HashSet hashSet9 = new HashSet(0);
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new m94.C2841d("index_PastSearchTripPlanner_stop_type", false, Arrays.asList(new String[]{"stop_type"}), Arrays.asList(new String[]{"ASC"})));
                m94 m948 = new m94("PastSearchTripPlanner", hashMap8, hashSet9, hashSet10);
                m94 a8 = m94.m21372a(n742, "PastSearchTripPlanner");
                if (!m948.equals(a8)) {
                    return new an3.C1724b(false, "PastSearchTripPlanner(com.delhitransport.onedelhi.data.PastSearchTripPlanner).\n Expected:\n" + m948 + "\n Found:\n" + a8);
                }
                HashMap hashMap9 = new HashMap(8);
                hashMap9.put("id", new m94.C2838a("id", "INTEGER", true, 1, (String) null, 1));
                hashMap9.put("stop_id", new m94.C2838a("stop_id", "INTEGER", true, 0, (String) null, 1));
                hashMap9.put("name", new m94.C2838a("name", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("lat", new m94.C2838a("lat", "REAL", true, 0, (String) null, 1));
                hashMap9.put("lon", new m94.C2838a("lon", "REAL", true, 0, (String) null, 1));
                hashMap9.put("stop_type", new m94.C2838a("stop_type", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("stop_desc", new m94.C2838a("stop_desc", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("cluster_id", new m94.C2838a("cluster_id", "INTEGER", true, 0, "-1", 1));
                HashSet hashSet11 = new HashSet(0);
                HashSet hashSet12 = new HashSet(2);
                hashSet12.add(new m94.C2841d("index_Stops_stop_id_stop_type", true, Arrays.asList(new String[]{"stop_id", "stop_type"}), Arrays.asList(new String[]{"ASC", "ASC"})));
                hashSet12.add(new m94.C2841d("index_Stops_stop_type", false, Arrays.asList(new String[]{"stop_type"}), Arrays.asList(new String[]{"ASC"})));
                m94 m949 = new m94("Stops", hashMap9, hashSet11, hashSet12);
                m94 a9 = m94.m21372a(n742, "Stops");
                if (m949.equals(a9)) {
                    return new an3.C1724b(true, (String) null);
                }
                return new an3.C1724b(false, "Stops(com.delhitransport.onedelhi.data.Stops).\n Expected:\n" + m949 + "\n Found:\n" + a9);
            }
        }, "d49b1cc67cebd3683f4cd469e21ffb31", "44f8a9c6ee5059e955df0d60959af411")).mo21827a());
    }

    public EvAllSearchDao evAllSearchDao() {
        EvAllSearchDao evAllSearchDao;
        if (this._evAllSearchDao != null) {
            return this._evAllSearchDao;
        }
        synchronized (this) {
            if (this._evAllSearchDao == null) {
                this._evAllSearchDao = new EvAllSearchDao_Impl(this);
            }
            evAllSearchDao = this._evAllSearchDao;
        }
        return evAllSearchDao;
    }

    public EVSearchDao evSearchDao() {
        EVSearchDao eVSearchDao;
        if (this._eVSearchDao != null) {
            return this._eVSearchDao;
        }
        synchronized (this) {
            if (this._eVSearchDao == null) {
                this._eVSearchDao = new EVSearchDao_Impl(this);
            }
            eVSearchDao = this._eVSearchDao;
        }
        return eVSearchDao;
    }

    public List<fj2> getAutoMigrations(@mr2 Map<Class<? extends C2629kf>, C2629kf> map) {
        return Arrays.asList(new fj2[]{new AppDatabase_AutoMigration_5_6_Impl()});
    }

    public Set<Class<? extends C2629kf>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(TicketDao.class, TicketDao_Impl.getRequiredConverters());
        hashMap.put(BookingDao.class, BookingDao_Impl.getRequiredConverters());
        hashMap.put(EVSearchDao.class, EVSearchDao_Impl.getRequiredConverters());
        hashMap.put(RouteSearchDao.class, RouteSearchDao_Impl.getRequiredConverters());
        hashMap.put(StopsDao.class, StopsDao_Impl.getRequiredConverters());
        hashMap.put(eo3.class, fo3.m15147d());
        hashMap.put(EvAllSearchDao.class, EvAllSearchDao_Impl.getRequiredConverters());
        hashMap.put(PastTripPlannerSearchDao.class, PastTripPlannerSearchDao_Impl.getRequiredConverters());
        hashMap.put(DirectionsStopDao.class, DirectionsStopDao_Impl.getRequiredConverters());
        return hashMap;
    }

    public PastTripPlannerSearchDao pastTripPlannerSearchDao() {
        PastTripPlannerSearchDao pastTripPlannerSearchDao;
        if (this._pastTripPlannerSearchDao != null) {
            return this._pastTripPlannerSearchDao;
        }
        synchronized (this) {
            if (this._pastTripPlannerSearchDao == null) {
                this._pastTripPlannerSearchDao = new PastTripPlannerSearchDao_Impl(this);
            }
            pastTripPlannerSearchDao = this._pastTripPlannerSearchDao;
        }
        return pastTripPlannerSearchDao;
    }

    public RouteSearchDao routeSearchDao() {
        RouteSearchDao routeSearchDao;
        if (this._routeSearchDao != null) {
            return this._routeSearchDao;
        }
        synchronized (this) {
            if (this._routeSearchDao == null) {
                this._routeSearchDao = new RouteSearchDao_Impl(this);
            }
            routeSearchDao = this._routeSearchDao;
        }
        return routeSearchDao;
    }

    public eo3 routesDao() {
        eo3 eo3;
        if (this._routesDao != null) {
            return this._routesDao;
        }
        synchronized (this) {
            if (this._routesDao == null) {
                this._routesDao = new fo3(this);
            }
            eo3 = this._routesDao;
        }
        return eo3;
    }

    public DirectionsStopDao stopsDao() {
        DirectionsStopDao directionsStopDao;
        if (this._directionsStopDao != null) {
            return this._directionsStopDao;
        }
        synchronized (this) {
            if (this._directionsStopDao == null) {
                this._directionsStopDao = new DirectionsStopDao_Impl(this);
            }
            directionsStopDao = this._directionsStopDao;
        }
        return directionsStopDao;
    }

    public TicketDao ticketDao() {
        TicketDao ticketDao;
        if (this._ticketDao != null) {
            return this._ticketDao;
        }
        synchronized (this) {
            if (this._ticketDao == null) {
                this._ticketDao = new TicketDao_Impl(this);
            }
            ticketDao = this._ticketDao;
        }
        return ticketDao;
    }
}
