package model;

import io.angelwing.olami.underwear.service.model.UnderwearCollection;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UnderwearCollectionTest {
    @Test
    public void shouldValidateSetUnderwearCollectionWithId(){
        System.out.println("setIdTest");
        final UnderwearCollection underwearCollection = new UnderwearCollection();
        final UUID expected = UUID.randomUUID();

        underwearCollection.setId(expected);
        assertEquals(underwearCollection.getId() , expected);
    }
    @Test
    public void  shouldValidateGetUnderwearCollectionWithId(){
        System.out.println("getIdTest");
        final UnderwearCollection underwearCollection = new UnderwearCollection();
        final UUID expected = UUID.randomUUID();

        underwearCollection.setId(expected);
        final UUID result = underwearCollection.getId();
        assertEquals(result , expected);
    }
    @Test
    public void  shouldValidateGetUnderwearCollectionWithName(){
        System.out.println("setNameTest");
        final UnderwearCollection underwearCollection = new UnderwearCollection();
        final String expectedName = "WinterFluffy";

        underwearCollection.setName(expectedName);
        final String result = underwearCollection.getName();
        assertEquals(result , expectedName);
    }
    @Test
    public void  shouldValidateSetUnderwearCollectionWithName(){
        System.out.println("getNameTest");
        final UnderwearCollection underwearCollection = new UnderwearCollection();
        final String expectedName = "WinterFluffy";

        underwearCollection.setName(expectedName);
        assertEquals(underwearCollection.getName(), expectedName);
    }

}