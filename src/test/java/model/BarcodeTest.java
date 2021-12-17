package model;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.angelwing.olami.underwear.service.model.Barcode;
import io.angelwing.olami.underwear.service.model.Underwear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarcodeTest {
    @Test
    public void shouldValidateSetBarcodeWithId(){
        System.out.println("setIdTest");
        final Barcode barcode = new Barcode();
        final String expectedId = "1234567890";

        barcode.setId(expectedId);
        assertEquals(barcode.getId() , expectedId);
    }
    @Test
    public void shouldValidateGetBarcodeWithId(){
        System.out.println("getIdTest");
        final Barcode barcode = new Barcode();
        final String expectedId = "1234567890";

        barcode.setId(expectedId);
        final String result = barcode.getId();
        assertEquals(result , expectedId);
    }
    @Test
    public void shouldValidateSetBarcodeWithUnderwear() {
        System.out.println("getUnderwearTest");
        final Barcode barcode = new Barcode();
        final Underwear expectedUnderwear = new Underwear();

        barcode.setUnderwear(expectedUnderwear);
        assertEquals(barcode.getUnderwear(), expectedUnderwear);
    }
    @Test
    public void shouldValidateGetBarcodeWithUnderwear() {
        System.out.println("getUnderwearTest");
        final Barcode barcode = new Barcode();
        final Underwear expectedUnderwear = new Underwear();

        barcode.setUnderwear(expectedUnderwear);
        final Underwear result = barcode.getUnderwear();
        assertEquals(result, expectedUnderwear);
    }
    @Test
    public void shouldValidateGetBarcodeWithAvailable() {
        System.out.println("getUnderwearTest");
        final Barcode barcode = new Barcode();
        final Boolean expectedAvailable = Boolean.TRUE;

        barcode.setAvailable(expectedAvailable);
        final Boolean result = barcode.getAvailable();
        assertEquals(result, expectedAvailable);
    }
    @Test
    public void shouldValidateSetBarcodeWithAvailable() {
        System.out.println("setUnderwearTest");
        final Barcode barcode = new Barcode();
        final Boolean expectedAvailable = Boolean.TRUE;

        barcode.setAvailable(expectedAvailable);
        assertEquals(barcode.getAvailable(), expectedAvailable);
    }


}