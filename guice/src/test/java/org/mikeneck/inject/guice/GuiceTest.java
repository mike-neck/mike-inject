package org.mikeneck.inject.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import junit.framework.Test;
import junit.framework.TestCase;
import org.atinject.tck.Tck;
import org.atinject.tck.auto.Car;

/**
 * @author mike
 */
public class GuiceTest extends TestCase {

    public static Test suite () {
        Injector injector = Guice.createInjector(new GuiceModule());
        Car car = injector.getInstance(Car.class);
        return Tck.testsFor(car, true, true);
    }
}
