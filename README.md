// Parminder Singh
// Professor Kanemoto 
// CPSC-39
// 2/2/26
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22467077)
# testingObjects

this is an example of a ReadMe file.

Answers:
1. Printing an object with no toString method  gets the class name, puts the @ symbol, then puts an integer which is a has code of the memory address. It's also private. 
2. name = null // string, age = 0// integer, breed = null // string
3. The programmer is responsible for making the constructor even for deault ( null, 0). If it's not done there's an error. 
4. The print changed to a new line, and @Override is useful because it's not only a check to see if it overrides something, it's also telling it to override it
5. private fields are more secure and are the standard. James Gosling wanted to stop people from hacking into refrigerators and toasters so private fields exist now. 

Reflection: 
1. What changed after you added the default constructor? After adding the parameterized constructor?
    - The default constructor uses basic information (null, 0) for it's uses, while the parametrized constructor can be called from and uses for specific things, so for our case we used it to call the dog's name and age
2. Why is encapsulation (private fields + getters/setters) preferred over public fields? Give one concrete validation rule you could add to a setter.
    - Encapsulation (private fields) are more secure, meaning that you can restrict changes done to them, 