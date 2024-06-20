# Product-App
# Simple Product App

This is a simple Product Management application implemented using Spring and Hibernate. It supports CRUD (Create, Read, Update, Delete) operations for managing products and uses MySQL as the database.

## Features
- Add new products
- View a list of products
- Update existing products
- Delete products

## Technologies
- Java
- Spring Framework
- Hibernate
- MySQL
- Maven

## Screenshots
- List of products

![Screenshot 2024-06-20 111344](https://github.com/AADIL028/ProductApp/assets/112774372/33fbd001-5453-4b19-adb3-8a0b200018e1)
- Add product

![Screenshot 2024-06-20 111521](https://github.com/AADIL028/ProductApp/assets/112774372/f84ae619-5492-47eb-afb6-40111eec49aa)
- Update product

![Screenshot 2024-06-20 111634](https://github.com/AADIL028/ProductApp/assets/112774372/e5549686-0597-478e-a6ca-298715d18579)
- Output after update.

![Screenshot 2024-06-20 111714](https://github.com/AADIL028/ProductApp/assets/112774372/2ef947ee-3f01-448f-8e5f-838bef00e5da)


## Setup
To get a local copy up and running, follow these simple steps:

1. **Clone the repository:**
    ```sh
    git clone https://github.com/AADIL028/ProductApp.git
    cd ProductApp
    ```

2. **Configure the MySQL Database:**
   - Create a database named `productdb`.
   - Update the `src/main/resources/hibernate.cfg.xml` file with your MySQL database credentials.
     ```xml
     <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/productdb</property>
     <property name="hibernate.connection.username">your-username</property>
     <property name="hibernate.connection.password">your-password</property>
     ```

3. **Build the project using Maven:**
    ```sh
    mvn clean install
    ```

4. **Deploy the application:**
   - Deploy the WAR file (`target/product-app.war`) to your preferred Servlet container (e.g., Apache Tomcat).
   - Start the server and access the application at `http://localhost:8080/ProductApp`.

## Usage
Once the application is running, you can perform CRUD operations on products using the following URLs and form submissions.

### Adding a Product
To add a new product:
1. Open your browser and go to `http://localhost:8080/ProductApp/add-product`.
2. Fill out the form with the product details.
3. Submit the form to add the product.

### Viewing Products
To view the list of products:
1. Open your browser and go to `http://localhost:8080/ProductApp`.
2. The page will display a list of all products.

### Updating a Product
To update an existing product:
1. Open your browser and go to `http://localhost:8080/ProductApp/update/{id}` (replace `{id}` with the actual product ID).
2. Fill out the form with the updated product details.
3. Submit the form to update the product.

### Deleting a Product
To delete a product:
1. Open your browser and go to `http://localhost:8080/ProductApp/delete/{id}` (replace `{id}` with the actual product ID).


