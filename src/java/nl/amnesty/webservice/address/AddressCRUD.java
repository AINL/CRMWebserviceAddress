package nl.amnesty.webservice.address;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ejb.Stateless;
import nl.amnesty.crm.persistence.EMAddress;
import nl.amnesty.crm.persistence.EntityManager;
import nl.amnesty.crm.entity.Address;

/**
 *
 * @author ed
 * 
 * algemene webservices uitgezet uit beveiligingsoogpunt
 */

@WebService()
@Stateless()
public class AddressCRUD {

    /**
     * Web service operation
     
    @WebMethod(operationName = "dummy")
    public String dummy() {
        //TODO write your implementation code here:
        return null;
    }*/

    /**
     * Web service operation
     
    @WebMethod(operationName = "create")
    public Address create(
            @WebParam(name = "Street") String street,
            @WebParam(name = "Houseno") int houseno,
            @WebParam(name = "HousenoSuffix") String housenosuffix,
            @WebParam(name = "PostalcodeNumeric") int postalcodenumeric,
            @WebParam(name = "PostalcodeAlpha") String postalcodealpha,
            @WebParam(name = "City") String city,
            @WebParam(name = "County") String county,
            @WebParam(name = "Province") String province,
            @WebParam(name = "State") String state,
            @WebParam(name = "ISOCountry") String isocountry) {
        //AddressController addresscontroller = new AddressController();
        try {
            Address address = new Address();
            address.setCity(city);
            address.setCounty(county);
            address.setHouseno(houseno);
            address.setHousenosuffix(housenosuffix);
            address.setIsocountry(isocountry);
            address.setPostalcodealpha(postalcodealpha);
            address.setPostalcodenumeric(postalcodenumeric);
            address.setProvince(province);
            address.setState(state);
            address.setStreet(street);
            EntityManager em = new EMAddress();
            return em.persist(address);
        } catch (Exception e) {
            Logger.getLogger(AddressCRUD.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    */
    
    /**
     * Web service operation
    */
    @WebMethod(operationName = "read")
    public Address read(
            @WebParam(name = "Addressid") long addressid) {
        try {
            EntityManager em = new EMAddress();
            return em.find(addressid);
        } catch (Exception e) {
            Logger.getLogger(AddressCRUD.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    
    /**
     * Web service operation
     
    @WebMethod(operationName = "update")
    public boolean update(
            @WebParam(name = "Addressid") long addressid,
            @WebParam(name = "Street") String street,
            @WebParam(name = "Houseno") int houseno,
            @WebParam(name = "HousenoSuffix") String housenosuffix,
            @WebParam(name = "PostalcodeNumeric") int postalcodenumeric,
            @WebParam(name = "PostalcodeAlpha") String postalcodealpha,
            @WebParam(name = "City") String city,
            @WebParam(name = "County") String county,
            @WebParam(name = "Province") String province,
            @WebParam(name = "State") String state,
            @WebParam(name = "ISOCountry") String isocountry) {
        try {
           Address address = new Address();
            address.setAddressid(addressid);
            address.setCity(city);
            address.setCounty(county);
            address.setHouseno(houseno);
            address.setHousenosuffix(housenosuffix);
            address.setIsocountry(isocountry);
            address.setPostalcodealpha(postalcodealpha);
            address.setPostalcodenumeric(postalcodenumeric);
            address.setProvince(province);
            address.setState(state);
            address.setStreet(street);
            EntityManager em = new EMAddress();
            return em.merge(address);
        } catch (Exception e) {
            Logger.getLogger(AddressCRUD.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    */
    
    /**
     * Web service operation
     
    @WebMethod(operationName = "delete")
    public boolean delete(
            @WebParam(name = "Addressid") long addressid) {
        try {
            EntityManager em = new EMAddress();
            return em.remove(addressid);
        } catch (Exception e) {
            Logger.getLogger(AddressCRUD.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    */
    
}
