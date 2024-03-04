# State Pattern
# Problem Scenario:
A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.
1. Active accounts: Allow deposits and withdrawals.
2. Suspended accounts: Disallow deposits and withdrawals transactions, but allow viewing account information.
3. Closed accounts: Disallow all transactions and viewing of account information.

Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

Implement the State pattern to improve code maintainability and flexibility:
- Define Account States: Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.
- Implement State Interface: Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.
- Implement State Behaviors: Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the - ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions.
Update Account Class:
- Include attributes for accountNumber and balance.
- Remove state-specific logic from the Account class.
- Introduce a reference to the current AccountState object.
- Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.
# Logic
If the account is active, you can either suspend it or close it. 
If the account is suspended, you can either activate or close it. No deposits and withdrawals allowed. 
If the account is closed, you can neither suspend nor activate it. No deposits and withdrawals allowed.
# Methods
- Setter and getter methods
- deposit(Double depositAmount): void
- withdraw(Double withdrawAmount): void
- suspend(): void
- activate(): void
- close() : void
- toString()   // displays account number and balance
# UML Diagram
![image](https://github.com/neoalaricv/statePattern/assets/142380105/9c90cc55-a042-4d36-b50c-a37d5e956f01)

