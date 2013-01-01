package org.mikeneck.inject.guice;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.atinject.tck.auto.*;
import org.atinject.tck.auto.accessories.SpareTire;

/**
 * @author mike
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Car.class).to(Convertible.class);
        requestStaticInjection(Convertible.class);
        bind(Seat.class);
        bind(Seat.class).annotatedWith(Drivers.class).to(DriversSeat.class);
        bind(Engine.class).to(V8Engine.class);
        bind(SpareTire.class);
        requestStaticInjection(SpareTire.class);
        bind(Tire.class).annotatedWith(Names.named("spare")).to(SpareTire.class);
    }
}
