package model;

import io.angelwing.olami.underwear.service.model.*;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UnderwearMakeTest {

    @Test
            public void shouldValidateSetUnderwearMakeWithId() {
        System.out.println("setUnderwearMakeTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final UUID expected = UUID.randomUUID();

        underwearMake.setId(expected);
        assertEquals(underwearMake.getId() , expected);
    }
    @Test
    public void shouldValidateGetUnderwearMakeWithId(){
        System.out.println("getUnderwearMakeTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final UUID expected = UUID.randomUUID();

        underwearMake.setId(expected);
        final UUID result = underwearMake.getId();
        assertEquals(result , expected);
    }
    @Test
    public void shouldValidateSetUnderwearMakeWithName(){
        System.out.println("setNameTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final String expectedName = "Bride";

        underwearMake.setName(expectedName);
        assertEquals(underwearMake.getName() , expectedName);
    }
    @Test
    public void shouldValidateGetUnderwearMakeWithName(){
        System.out.println("getNameTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final String expectedName = "Bride";

        underwearMake.setName(expectedName);
        final String result = underwearMake.getName();
        assertEquals(result , expectedName);
    }
    @Test
    public  void shouldValidateSetUnderwearMakeWithUnderwearCollection(){
        System.out.println("setUnderwearCollectionName");
        final UnderwearMake underwearMake = new UnderwearMake();
        final UnderwearCollection expectedCollection = new UnderwearCollection();

        underwearMake.setUnderwearCollection(expectedCollection);
        assertEquals(underwearMake.getUnderwearCollection() , expectedCollection);
    }
    @Test
    public  void shouldValidateGetUnderwearMakeWithUnderwearCollection() {
        System.out.println("getUnderwearCollectionName");
        final UnderwearMake underwearMake = new UnderwearMake();
        final UnderwearCollection expectedCollection = new UnderwearCollection();

        underwearMake.setUnderwearCollection(expectedCollection);
        final UnderwearCollection result = underwearMake.getUnderwearCollection();
        assertEquals(result, expectedCollection);
    }
    @Test
    public void shouldValidateSetUnderwearMakeWithYear(){
        System.out.println("setYearTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final Integer expectedYear= 2021;

        underwearMake.setYear(expectedYear);
        assertEquals(underwearMake.getYear() , expectedYear);
    }
    @Test
    public void shouldValidateGetUnderwearMakeWithYear() {
        System.out.println("getYearTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final Integer expectedYear = 2021;

        underwearMake.setYear(expectedYear);
        final Integer result = underwearMake.getYear();
        assertEquals(result, expectedYear);
    }
    @Test
    public void shouldValidateSetUnderwearMakeWithBraType(){
        System.out.println("setBraTypeTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final BraType expectedBraType = BraType.BRALETTE;

        underwearMake.setBraType(expectedBraType);
        assertEquals(underwearMake.getBraType() , expectedBraType);
    }
    @Test
    public void shouldValidateGetUnderwearMakeWithBraType(){
        System.out.println("getBraTypeTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final BraType expectedBraType = BraType.BRALETTE;

        underwearMake.setBraType(expectedBraType);
        final BraType result = underwearMake.getBraType();
        assertEquals(result , expectedBraType);
    }
    @Test
    public void shouldValidateSetUnderwearMakeWithPantiesType(){
        System.out.println("setPantiesTypeTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final PantiesType expectedPantiesType = PantiesType.BRAZILIAN;

        underwearMake.setPantiesType(expectedPantiesType);
        assertEquals(underwearMake.getPantiesType() , expectedPantiesType);
    }
    @Test
    public void shouldValidateGetUnderwearMakeWithPantiesType() {
        System.out.println("getPantiesTypeTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final PantiesType expectedPantiesType = PantiesType.BRAZILIAN;

        underwearMake.setPantiesType(expectedPantiesType);
        final PantiesType result = underwearMake.getPantiesType();
        assertEquals(result, expectedPantiesType);
    }
    @Test
    public void shouldValidateSetUnderwearMakeWithGarterbeltType() {
        System.out.println("setTypeTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final GarterbeltType expectedType= GarterbeltType.LACE;

        underwearMake.setGarterbeltType(expectedType);
        assertEquals(underwearMake.getGarterbeltType(), expectedType);
    }
    @Test
    public void shouldValidateGetUnderwearMakeWithGarterbeltType() {
        System.out.println("getTypeTest");
        final UnderwearMake underwearMake = new UnderwearMake();
        final GarterbeltType expectedType= GarterbeltType.LACE;

        underwearMake.setGarterbeltType(expectedType);
        final GarterbeltType result = underwearMake.getGarterbeltType();
        assertEquals(result, expectedType);
    }



}