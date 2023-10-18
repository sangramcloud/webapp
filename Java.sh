#!/bin/bash

#installing the unzip 
sudo apt-get install unzip
# unzip Sangram_Vuppala_002958963_03.zip


#install jdk
echo "---x---Adding Java Repository---x---"
sudo apt update && sudo apt upgrade -y

echo "---x---Installing Java 17---x---"
sudo apt install openjdk-17-jdk -y

echo "---x---Setting Java Environment Variables---x---"
echo "export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64/" >> ~/.bashrc
echo "export PATH=$PATH:$JAVA_HOME/bin" >> ~/.bashrc
source ~/.bashrc

#Install Maven
#echo "---x---Installing Maven---x---"
#sudo apt install maven -y

#After DB installation run this to deploy web application
#mvn clean install
# mvn spring-boot:run

# or you can create a jar file
#mvn clean package
#java -jar <webApplication.jar> ( this jar file will be created in the target folder of webapp)

#Install MariaDb
echo "sudo apt install mariadb-server"
sudo apt install mariadb-server


sudo systemctl start mariadb
echo "sudo systemctl enable mariadb"
sudo systemctl enable mariadb

echo "sudo mysql_secure_installation"
sudo mysql_secure_installation

sudo mysql <<EOF
ALTER USER 'root'@'localhost' IDENTIFIED BY 'Ssangramm@12';
FLUSH PRIVILEGES;
EOF

sudo apt update
sudo apt upgrade -y