# Project: Email Sending Service
This project implements an email sending service using Java, Spring Boot, and AWS SES, following Clean Architecture principles.

<p>
    <img src="https://skillicons.dev/icons?i=java,spring,aws" width="245"/>
</p>

## Architecture
The project's architecture is based on the principles of Clean Architecture, which aims to separate software responsibilities into well-defined layers. This makes the code more modular, testable, and maintainable.

The project's layers are as follows:

- **Core:** 
  - **Exceptions:** Contains the domain exceptions to the problem.
  - **UseCases:** Contains the use cases of the application.
- **Adapters:**
  - **EmailSenderGateway:** Contains the implementation of the gateway interface for sending emails.
- **Application:**
    - **EmailSenderService:** Contains the business logic for sending emails.
- **Controllers:**
   - **EmailSenderController:** Contains the REST endpoints for sending emails. 
- **Infra:**
    - **AwsSesConfig:** Contains the AWS SES configuration.
    - **SesEmailSender:** Contains the implementation of the gateway interface for AWS SES.

## Setup

To set up the project, follow these steps:

- **1.** Clone the repository to your local directory.
- **2.** Create an `application.properties` file in the `src/main/resources` folder and set the following properties:

```shell
    cloud.aws.credentials.accessKey=YOUR_ACCESS_KEY
    cloud.aws.credentials.secretKey=YOUR_SECRET_KEY
    cloud.aws.region.static=YOUR_REGION
```

#### Where:

- `YOUR_ACCESS_KEY` is the access key for your AWS account.
- `YOUR_SECRET_KEY` is the secret key for your AWS account.
- `YOUR_REGION` is the AWS region you want to use.



- **3.** Run the project using Maven:
```shell
  mvn spring-boot:run
  ```

## Usage

To send an email, make a POST request to the `/api/emails` endpoint with the following JSON body:
```json
{
  "to": "to@example.com",
  "subject": "Subject",
  "body": "Body"
}
```
## Additional Considerations

- The project is under development and can be improved with new features and capabilities.
- The project documentation can be improved to make the code easier to use and understand.
- The project can be integrated with other tools and systems.

## Contributions
Contributions are welcome! Feel free to send pull requests or open issues for suggestions and improvements.

### Here are some guidelines for contributing:

- Make sure your code is well-formatted and follows the project's coding style.
- Write unit tests for your code.
- Document your changes clearly.
- Submit your pull requests to the `main` branch.

### We appreciate your contributions!

### Here are some specific areas where you can contribute:

- **Adding new features:** If you have an idea for a new feature, please open an issue to discuss it.
- **Fixing bugs:** If you find a bug, please open an issue to report it.
- **Improving documentation:** If you see any areas where the documentation could be improved, please submit a pull request to fix it.

## Contact
For more information, please contact my [LinkedIn](https://www.linkedin.com/in/fabrizio-cagnoni-silveira-323505270/).

### Additional information:

- You can also find me on [GitHub](https://github.com/Fabriziosilveira).

- I am always happy to help with any questions or problems you may have with the project.

**Thank you for your interest in my work!**
