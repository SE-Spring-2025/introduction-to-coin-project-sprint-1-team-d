Created a Metallurgy hierarchy with an interface and concrete classes.

Tested the concrete Metallurgy implementations (interface itself didn’t need testing).

Refactored the Coin class to use a Metallurgy delegate and added a smelt() method.

Updated the Coin constructor to accept and use a Metallurgy object from subclasses.

Refactored concrete Coin classes (e.g., Penny) to pass a Metallurgy object instead of a string.

Built a Demo class to show that we can create a Penny with different metallurgies.

Ensured all code meets Checkstyle standards and includes unit tests
