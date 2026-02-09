<h1>statepattern</h1>

<h2>Problem:</h2>
<p>A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.</p>
<h2>Requirements:</h2>
<h3>Idle State:</h3>
<p>Allow item selection.</br>
Disallow dispensing items and inserting coins.</p>
<h3>ItemSelected State:</h3>
<p>Allow inserting coins and dispensing items.</br>
Disallow item selection.</p>
<h3>Dispensing State:</h3>
<p>Allow no operations.</br>
Automatically transition back to the "Idle" state after dispensing is complete.</p>
<h3>OutOfOrder State:</h3>
<p>Disallow all operations.</p>

<h2>Current System: The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.</h2></br>
Implement the State Pattern to improve code maintainability and flexibility:
Define VendingMachine States:
Create separate classes representing different machine states: IdleState, ItemSelectedState, DispensingState, and OutOfOrderState.
Implement State Interface:
Define an interface VendingMachineState with methods for common actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder.
Implement State Behaviors:
Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, the IdleState class would allow item selection, while the OutOfOrderState wouldn't allow any operations.
Update VendingMachine Class:
Include attributes for item inventory and balance.
Remove state-specific logic from the VendingMachine class.
Introduce a reference to the current VendingMachineState object.
Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods.

