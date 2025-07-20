# 🚀 Enterprise Java CI/CD with Jenkins, GitOps, and Kubernetes Observability

## 📘 Project Overview
This project demonstrates a complete end-to-end CI/CD and monitoring solution for a cloud-native Java microservice using modern DevOps tools. It includes automated code building, static code analysis, Docker image scanning, GitOps-based Kubernetes deployment, and end-to-end observability.

---

## 🔗 GitHub Repository
[https://github.com/Mithra1995/Jenkins-argocd](https://github.com/Mithra1995/Jenkins-argocd)

---

## 🧰 Technology Stack

| Component    | Purpose                                                       |
|--------------|---------------------------------------------------------------|
| Java + Maven | Application development and dependency management             |
| Jenkins      | CI/CD orchestration                                           |
| SonarQube    | Static code analysis and quality gate enforcement             |
| Trivy        | Docker image vulnerability scanning                           |
| Docker       | Containerization of the Java microservice                     |
| Kubernetes   | Container orchestration and deployment (Minikube cluster)     |
| Argo CD      | GitOps-based Continuous Deployment                            |
| Prometheus   | Metrics collection and monitoring                             |
| Grafana      | Metrics visualization and alerting                            |

---

## 🧪 Features
- Automated CI pipeline with Jenkins
- Static code analysis using SonarQube
- Container image security scanning using Trivy
- Docker image push to Amazon ECR
- GitOps-based deployment with Argo CD
- Kubernetes cluster setup via Minikube
- Monitoring and alerting with Prometheus and Grafana
- Email notification for post-build success

---

## ⚙️ Implementation Steps

### 1. Infrastructure Setup
- Launch EC2 instance (t2.large, 50GB EBS)
- Install:
  - Java, Maven
  - Jenkins
  - SonarQube
  - Docker
  - Git
  - Trivy

### 2. Jenkins CI Pipeline
- Configure Jenkins pipeline:
  - Clone repo and build code
  - Run SonarQube scan
  - Scan Docker image with Trivy
  - Push image to ECR
  - Update `deployment.yaml` with new image tag
- Add email notification for post-build success

### 3. Kubernetes & Argo CD Setup
- Install Minikube
- Install Argo CD
- Create Argo CD Application pointing to GitHub repo
- Sync Argo CD App → Monitor deployment

### 4. Observability Stack
- Install Prometheus
- Install Grafana
- Configure Prometheus as data source in Grafana
- Create dashboards to monitor pod/resource usage

---

## 🌐 Accessing the App
- Use `minikube ip` and exposed NodePort (e.g. `31564`) to access the deployed app.
```bash
minikube service <your-service-name> --url
