git clone https://github.com/prathmeshwake/IT-Service-company-Website.git
cd IT-Service-company-Website
apt install maven
mvn clean package
docker build -t prathmeshwake/it-services:latest . --> Build Docker image
log in to docker and make sure that docker repo is there to store the image and push it
docker login -u prathmeshwake
provide docker PAT token
docker push prathmeshwake/it-services:latest
kubectl apply -f k8s-deployment.yaml
kubectl apply -f k8s-service.yaml
kubectl get pods
kubectl get svc
check the website traffic with port 30080
