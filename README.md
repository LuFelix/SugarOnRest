# Being RESTful with SugarCRM/SuiteCRM in Java 
SugarOnRest is a Java SugarCRM CE 6.x/SuiteCRM 7.x API client. SugarOnRest is a [UniRest Java](https://github.com/Mashape/unirest-java) implementation. It is a Restful CRUD client that implements the SugarCRM module Create, Read, Update and Delete functionalities.

SugarOnRest implements following SugarCRM REST API method calls: **_oauth_access, get_entry, get_entry_list, set_entry, set_entries._**

This is a port of .NET C# [SugarRestSharp](https://github.com/mattkol/SugarRestSharp).

For more info/documentation, please check [SugarOnRest wiki](https://github.com/mattkol/SugarOnRest/wiki)

### Basic Sample Usages
```java
string sugarCrmUrl = "http://demo.suiteondemand.com/service/v4_1/rest.php";
string sugarCrmUsername = "will";
string sugarCrmPassword = "will";

SugarRestClient client = new SugarRestClient(sugarCrmUrl, sugarCrmUsername, sugarCrmPassword);

// Option 1 - Read by known Java Pojo type - Accounts.
SugarRestRequest accountRequest = new SugarRestRequest(Accounts.class, RequestType.ReadById);

// set the account id to read.
accountRequest.setParameter("8d836b3f-d5a3-4100-6e62-5883a43dc96f");
SugarRestResponse accountResponse = client.execute(accountRequest);
Accounts account = (Accounts)accountResponse.getData();


// Option 2 - Read by known SugarCRM module name - "Contacts".
SugarRestRequest contactRequest = new SugarRestRequest("Contacts", RequestType.ReadById);
contactRequest.setParameter(contactid);
SugarRestResponse contactRresponse = client.execute(contactRequest);
Contacts contact = (Contacts)contactRresponse.getData();

```


