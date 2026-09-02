# Shared Jenkins Library

Reference project: https://gitlab.com/twn-devops-bootcamp/latest/08-jenkins/jenkins-shared-library

This is an example of organising reusable Groovy scripts for Jenkins

## Make globally availalbe in Jenkins

- In Jenkins > Manage > System > Global pipeline libraries
- Check this commit and repository for an example how to use the shared library in the Jenkinsfile: [TWN-Jenkins/multibranch-sharedlib](https://github.com/JonathanBaqDev/TWN-Jenkins/commit/48718be5d9d79c3050ad98c341df87030ff75dae)
- Re-usable code between groovy scripts can be extracted to classes that can be called from the *src folder*, see [commit](https://github.com/JonathanBaqDev/TWN-Jenkins-Shared-Library/commit/b1d88bcb6457e6809662af35d7359666b3fde138)
- You can make the shared library project scoped by importing in the Jenkinsfile vs configuring as a global library in Jenkins, see [commit](https://github.com/JonathanBaqDev/TWN-Jenkins/commit/4fba1cb0815d416f0e143247c379c3861a0bf947)