# Art-Gallery-first-OOP-project-

## Task Description
The objective of this application is to create a mini art gallery showcasing well-known art pieces. Users can view each painting with a short description and details about the artist. Additionally, there's an option to purchase paintings by creating an account and providing personal information.

### Features:
- Display 8 paintings on the front page, each clickable for more information.
- Detailed pages for each painting including description, artist, price, movement, and dimensions.
- Ability to add paintings to a shopping cart.
- Account creation and login functionalities.
- Cart management for logged-in users.
- Confirmation message upon placing an order.

### Account Creation:
- Users need to provide: first name, last name, email address, username, password, address, town, and country.

### Login:
- Incorrect login attempts prompt a message to create a new account.
- Successful login redirects users to the main page.

### Cart:
- Shows selected paintings and their prices.
- Confirmation button to place orders.

## Class Discovery

### Cart
- **tableW**: Populate the JTable
- **DBConnection.showWindow**: Prepare the frame for the cart
- **DBConnection (calling tableW)**

### DBConnection
- **selectDescriptionById**: Select bibliography from the database according to the artist id
- **paintingDescriptionById**: Select painting description from the database according to the artist id
- **selectPaintingById**: Select painting title from the database according to the artist id
- **showAuthorName**: Select artist’s name from the database according to the artist id
- **ultimul_index**: Calculate the last id from the customer table
- **ultimul_index_cart**: Calculate the last id from the cart table
- **registration**: Create a new account and save data in the database
- **painting_size**: Select painting size from the database according to the artist id
- **painting_price**: Select painting price from the database according to the artist id
- **painting_movement**: Select painting movement from the database according to the artist id
- **accountSearch**: Check if the account exists in the database
- **cartSearch**: Search the cart of the logged-in person
- **deleteFromCart**: Delete the cart of the logged-in person
- **addCos**: Create a new cart

### LogIn
- **showWindow**: Prepare the frame for login
- **DBConnection**

### Main
- **main**: MainPage
- **MainPage.getName**: Display painting names in JLabels
- **MainPage.showWindow**: Prepare the frame for the main frame and create objects of type PaintingFrame

### PaintingFrame
- **showWindow**: Prepare the frame for each painting
- **MainPage**

### SignUp
- **showWindow**: Prepare the frame for sign up
- **MainPage.getField**: Get text from JTextField
