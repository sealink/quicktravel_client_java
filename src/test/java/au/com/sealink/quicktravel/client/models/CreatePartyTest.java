package au.com.sealink.quicktravel.client.models;

import au.com.sealink.quicktravel.client.helpers.FixtureHelper;
import au.com.sealink.quicktravel.client.models.createParty.*;
import au.com.sealink.quicktravel.client.models.createParty.Client;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Assert;
import org.junit.Test;


public class CreatePartyTest {

    @Test
    public void createPerson() {
        Person person = new Person();
        person.setFirstName("First");
        person.setLastName("Last");
        person.setGender("Male");
        person.setTitle("Mr");
        Client client = new Client();
        client.setClientTypeId(3);
        client.setFrequentTraveller(false);
        person.setClient(client);

        Contact contact = new Contact();
        contact.setEmail("Email");
        contact.setFax("Fax");
        contact.setMobile("Mobile");
        contact.setPhone("Phone");
        contact.setWebsite("Website");
        person.setContact(contact);
        person.setAuthentication(
                new Authentication("homer", "password")
        );

        Address address = new Address();
        address.setAddressLine1("Address Line 1");
        address.setAddressLine2("Address Line 2");
        address.setState("State");
        address.setCity("City");
        address.setPostcode("Postcode");
        address.setCountryId(14);
        person.setAddress(address);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(new CreateParty(person));
        Assert.assertEquals(FixtureHelper.fromFile("fixtures/create_person_request.json"), json);

        Assert.assertEquals("First", person.getFirstName());
        Assert.assertEquals("Last", person.getLastName());
        Assert.assertEquals("Male", person.getGender());
        Assert.assertEquals("Mr", person.getTitle());
        Assert.assertEquals("homer", person.getAuthentication().getLogin());
        Assert.assertEquals("password", person.getAuthentication().getPassword());
        Assert.assertEquals("Address Line 1", person.getAddress().getAddressLine1());
        Assert.assertEquals("Address Line 2", person.getAddress().getAddressLine2());
        Assert.assertEquals("State", person.getAddress().getState());
        Assert.assertEquals("City", person.getAddress().getCity());
        Assert.assertEquals("Postcode", person.getAddress().getPostcode());
        Assert.assertEquals(new Integer(14), person.getAddress().getCountryId());

        Assert.assertEquals("Email", person.getContact().getEmail());
        Assert.assertEquals("Fax", person.getContact().getFax());
        Assert.assertEquals("Mobile", person.getContact().getMobile());
        Assert.assertEquals("Phone", person.getContact().getPhone());
        Assert.assertEquals("Website", person.getContact().getWebsite());

        Assert.assertEquals(3, person.getClient().getClientTypeId());
        Assert.assertEquals(false, person.getClient().getFrequentTraveller());
        Assert.assertEquals("Person", person.getPartyType());
    }

    @Test
    public void createOrganisation() {
        Organisation organisation = new Organisation();
        organisation.setName("Organisation Name");
        organisation.setBusinessNumber("123456789");
        organisation.setBusinessNumberType("ABN");
        Client client = new Client();
        client.setClientTypeId(3);
        client.setExternalIdentifier("123-ABC");
        client.setCommissionLevelId(1);
        organisation.setClient(client);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(new CreateParty(organisation));
        Assert.assertEquals(FixtureHelper.fromFile("fixtures/create_organisation_request.json"), json);

        Assert.assertEquals("Organisation Name", organisation.getName());
        Assert.assertEquals("123456789", organisation.getBusinessNumber());
        Assert.assertEquals("ABN", organisation.getBusinessNumberType());
        Assert.assertEquals("123-ABC", organisation.getClient().getExternalIdentifier());
        Assert.assertEquals("Organisation", organisation.getPartyType());
        Assert.assertEquals(new Integer(1), organisation.getClient().getCommissionLevelId());

    }
}