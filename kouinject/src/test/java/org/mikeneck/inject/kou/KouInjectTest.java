package org.mikeneck.inject.kou;

import junit.framework.Test;
import junit.framework.TestCase;
import net.usikkert.kouinject.DefaultInjector;
import net.usikkert.kouinject.Injector;
import org.atinject.tck.Tck;
import org.atinject.tck.auto.Car;

/**
 * @author mike
 */
public class KouInjectTest extends TestCase {

    public static Test suite () {
        Injector injector = new DefaultInjector("org.atinject.tck.auto");
        Car car = injector.getBean(Car.class);
        return Tck.testsFor(car, true, true);
    }
}
