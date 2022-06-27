package tasks.grasshopperPersonalizedMessage;
/*

DESCRIPTION:
Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

Use conditionals to return the proper message:

case	return
name equals owner	'Hello boss'
otherwise	'Hello guest'

 */

public class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        return name.equals(owner)? "Hello boss" : "Hello quest";
    }
}
