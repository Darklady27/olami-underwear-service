package model;

import io.angelwing.olami.underwear.service.model.Color;
import io.angelwing.olami.underwear.service.model.Size;
import io.angelwing.olami.underwear.service.model.Underwear;
import io.angelwing.olami.underwear.service.model.UnderwearMake;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UnderwearTest {

    @Test
    public void shouldValidateSetUnderwearWithId(){
        System.out.println("setUnderwearTest");
        final UUID expectedId = UUID.randomUUID();
        final Underwear underwear = new Underwear();

        underwear.setId(expectedId);
        assertEquals(underwear.getId() , expectedId);
    }
    @Test
    public void shouldValidateGetUnderwearWithId(){
        System.out.println("getUnderwear");
        final Underwear underwear = new Underwear();
        final UUID expectedId = UUID.randomUUID();

        underwear.setId(expectedId);

        final UUID result = underwear.getId();

        assertEquals(result , expectedId);
    }

    @Test
    public void shouldValidateSetUnderwearWithUnderwearMake(){
        System.out.println("setUnderwearMakeTest" );
        final Underwear underwear = new Underwear();
        final UnderwearMake expectedUnderwearMake = new UnderwearMake();

        underwear.setUnderwearMake(expectedUnderwearMake);
        assertEquals(underwear.getUnderwearMake() , expectedUnderwearMake);
    }
    @Test
    public void shouldValidateGetUnderwearWithUnderwearMake(){
        System.out.println("getUnderwearMakeTest");
        final Underwear underwear = new Underwear();
        final UnderwearMake expectedUnderwearMake = new UnderwearMake();

        underwear.setUnderwearMake(expectedUnderwearMake);
        final UnderwearMake result = underwear.getUnderwearMake();
        assertEquals(result , expectedUnderwearMake);
    }
    @Test
    public void shouldValidateSetUnderwearWithColor(){
        System.out.println("setColorTest");
        final Underwear underwear = new Underwear();
        final Color color = Color.BLACK;
        underwear.setColor(color);

        assertEquals(underwear.getColor() , color);
    }
    @Test
    public void shouldValidateGetUnderwearWithColor(){
        System.out.println("getColorTest");
        final Underwear underwear = new Underwear();
        final Color color = Color.BLACK;

        underwear.setColor(color);
        final Color result = underwear.getColor();
        assertEquals(result , color);
    }

    @Test
    public void shouldValidateSetUnderwearWithSize(){
        System.out.println("setSizeTest");
        final Underwear underwear = new Underwear();
        final Size size = Size.XS;

        underwear.setSize(size);
        assertEquals(underwear.getSize() , size);
    }

    @Test
    public void shouldValidateGetUnderwearWithSize(){
        System.out.println("getSizeTest");
        final Underwear underwear = new Underwear();
        final Size size = Size.XS;

        underwear.setSize(size);
        final Size result = underwear.getSize();
        assertEquals(result , size);
    }

    @Test
    public void shouldValidateSetUnderwearWithRegularPrices(){
        System.out.println("setRegularPricesTest");
        final  Underwear underwear = new Underwear();
        final Double expectedRegularPrices = 70.0;

        underwear.setRegularPrices(expectedRegularPrices);
        assertEquals(underwear.getRegularPrices() , expectedRegularPrices);
    }

    @Test
    public void shouldValidateGetUnderwearWithRegularPrices(){
        System.out.println("getRegularPrices");
        final Underwear underwear = new Underwear();
        final Double expectedRegularPrices = 70.0;

        underwear.setRegularPrices(expectedRegularPrices);

        final Double result = underwear.getRegularPrices();
        assertEquals(result , expectedRegularPrices );
    }

    @Test
    public void shouldValidateSetUnderwearWithSalePrices(){
        final Underwear underwear = new Underwear();
        final Double expectedSalePrices = 5.0;

        underwear.setSalePrices(expectedSalePrices);
        assertEquals(underwear.getSalePrices() , expectedSalePrices);
    }

    @Test
    public  void shouldValidateGetUnderwearWithSalePrices(){
        final Underwear underwear = new Underwear();
        final Double expectedSalePrices = 5.0;

        underwear.setSalePrices(expectedSalePrices);
        final Double result = underwear.getSalePrices();
        assertEquals(result , expectedSalePrices);
    }



}