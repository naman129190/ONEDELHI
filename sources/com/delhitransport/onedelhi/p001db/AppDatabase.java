package com.delhitransport.onedelhi.p001db;

import com.delhitransport.onedelhi.data.AllRoutes;
import com.delhitransport.onedelhi.data.AllStops;
import com.delhitransport.onedelhi.data.PastSearchTripPlanner;
import com.delhitransport.onedelhi.data.Stops;
import com.onedelhi.secure.C2444if;
import com.onedelhi.secure.eo3;
import com.onedelhi.secure.ym3;
import com.onedelhi.secure.zd0;

@zd0(autoMigrations = {@C2444if(from = 5, mo17743to = 6)}, entities = {UserTickets.class, UserBookings.class, EVSearches.class, RouteSearches.class, AllStops.class, AllRoutes.class, EvAllSearch.class, PastSearchTripPlanner.class, Stops.class}, exportSchema = true, version = 6)
/* renamed from: com.delhitransport.onedelhi.db.AppDatabase */
public abstract class AppDatabase extends ym3 {
    public abstract StopsDao allStopsDao();

    public abstract BookingDao bookingDao();

    public abstract EvAllSearchDao evAllSearchDao();

    public abstract EVSearchDao evSearchDao();

    public abstract PastTripPlannerSearchDao pastTripPlannerSearchDao();

    public abstract RouteSearchDao routeSearchDao();

    public abstract eo3 routesDao();

    public abstract DirectionsStopDao stopsDao();

    public abstract TicketDao ticketDao();
}
