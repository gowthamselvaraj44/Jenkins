def buildApp(){
      echo 'building the app'
}
def testApp(){
      echo 'testing the app'
}

def deployApp(){
      echo "Deploying the application..."
      echo "Deploying version ${params.VERSION}"
}

return this
