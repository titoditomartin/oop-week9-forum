# oop-week9-forum

1. 
(a)
A class is like a blueprint or template that describes the behavior and properties of a particular category of objects. In the given scenario, the SalesPerson class is a blueprint that describes the behavior and properties of salespeople.
An instantiation of a class, on the other hand, is a specific instance of an object that is created based on the blueprint or class. In the given scenario, when a new salesperson is hired, an instance of the SalesPerson class is created with that person's details.

(b)
Inheritance is a way to create new classes that are built upon existing classes. In the given scenario, the company can create a new class called Manager that inherits properties and behaviors from a more general Employee class. The Manager class can have additional properties and behaviors specific to managers.
Another example of inheritance could be creating a SalesManager class that inherits from the Manager class and also has additional properties and behaviors specific to sales managers.

(c)
Libraries are pre-written code that can be reused in different programs. In the given scenario, the company can use libraries of pre-written code to handle common tasks, such as generating reports or processing payments, instead of writing new code from scratch. This can save time and effort in the development process and also reduce the likelihood of errors.


2.
(b) Accessor methods, also known as getters, are necessary for the SalesPerson class because they allow other parts of the program to access the private instance variables of a SalesPerson object without having direct access to those variables. This helps maintain data encapsulation and makes the program more secure and less prone to errors or unintended modifications. For example, the getCount() method in the SalesPerson class allows other parts of the program to retrieve the number of sales made by a SalesPerson object without directly accessing the "count" variable.


(c)(i) ![uml](https://github.com/titoditomartin/oop-week9-forum/assets/114073725/7b76a391-d67f-4fbb-9218-8bc9a6d4c004)

(c)(ii) A future change in the design of the Sales object, such as adding or removing properties or changing the data types of existing properties, could cause errors in the code that uses the Sales class, including the SalesPerson class. For example, if the getValue() method returns an integer instead of a double, any code that uses this method expecting a double could fail.

(d) 102, 2, 2550.4, 5000.0

(h) Suggest changes that must be made to the SalesPerson class and/or the Sales class to allow these calculations to be made.

To calculate each salesperson's salary based on the sales made during a given month, the Sales class would need to be modified to include a timestamp indicating when the sale occurred. This information could then be used in the Payroll class to filter the Sales objects by month and calculate the sales for each salesperson for that month. The SalesPerson class could also be modified to include a salary attribute, which could be used in conjunction with the total sales to calculate the salesperson's salary for the month.

(i) Polymorphism is a key concept in object-oriented programming, and it is used extensively in this suite of programs. In particular, the SalesPerson class and the Sales class both have constructors that allow


