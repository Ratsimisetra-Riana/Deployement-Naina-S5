git clone http://github.com/Ratsimisetra-Riana/Deployement-Naina-S5.git /home/riana/Deployement/test

cd /home/riana/Deployement/test

javac -d . FrontServlet.java

mkdir ./WEB-INF
mkdir ./classes

cp -R ./Controller ./classes
cp -R ./classes ./WEB-INF
cp ./web.xml ./WEB-INF

jar cvf Deployement.war ./WEB-INF

mv Deployement.war /opt/tomcat/apache-tomcat-10.1.5/webapps


