interface IPerson {}

class makePerson implements IPerson{
  String name;
  int age;
  String gender;
  
  makePerson(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}
class makePersonWithAddress implements IPerson{
  String name;
  int age;
  String gender;
  Address address;
  
  makePersonWithAddress(String name, int age, String gender, Address address){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.address = address;
  }
}
class Address{
  String city;
  String state;
  
  Address(String city, String state){
    this.city = city;
    this.state = state;
  }
}
class ExamplesPerson{
  IPerson tim = new makePerson("Tim",20,"M");
  IPerson pat = new makePerson("Pat",19,"F");
  IPerson kim = new makePerson("Kim",17,"F");
  IPerson dan = new makePerson("Dan",22,"M");
  
  Address t = new Address("Warwick","RI");
  Address pk = new Address("Boston","MA");
  Address n = new Address("Nashua","NH");
  Address l = new Address("Cebu","PH");
  IPerson timWithAddress = new makePersonWithAddress("Tim",20,"M",t);
  IPerson patWithAddress = new makePersonWithAddress("Pat",19,"F",pk);
  IPerson kimWithAddress = new makePersonWithAddress("Kim",17,"F",pk);
  IPerson danWithAddress = new makePersonWithAddress("Dan",22,"M",n);
  IPerson johnWithaAddress = new makePersonWithAddress("John",18,"M",l);
  IPerson rayWithaAddress = new makePersonWithAddress("Ray",18,"M",l);
  
}
