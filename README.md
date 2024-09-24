# INFORMATION EXPERT

## Definition
The Information Expert principle suggests that responsibilities should be assigned to the class that has the necessary information to fulfill them effectively.

## Purpose
The main goal is to enhance cohesion and reduce coupling in the system. By assigning responsibilities to the class that is most knowledgeable about the data it manages, you create a design that is easier to understand and maintain.

## Example
Consider a `Customer` class that contains customer information. If you need to calculate the total purchases for that customer, the responsibility for this calculation should reside within the `Customer` class. This way, the logic for total purchases is directly associated with the data it operates on.

## Benefits
- **Clarity**: Responsibilities are logically assigned, making the system easier to comprehend.
- **Maintainability**: Changes related to the responsibility can be managed within a single class, reducing the risk of unintended side effects.
- **Encapsulation**: Promotes better encapsulation as related data and behavior are bundled together.


