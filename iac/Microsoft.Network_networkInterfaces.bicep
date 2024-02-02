resource raiseAnIssue 'Microsoft.Network/networkInterfaces@2022-11-01' = {
  name: 'Raise an issue'
  properties: {
    ipConfigurations: [
      {
        properties: {
          subnet: {
            properties: {
              networkSecurityGroup: {
                properties: {
                  securityRules: [
                    {
                      properties: {
                        // TODO fix me
                        direction: 'Inbound'
                        access: 'Allow'
                        protocol: 'TCP'
                        destinationPortRange: '*'
                        sourceAddressPrefix: '*'
                      }
                    }
                  ]
                }
              }
            }
          }
        }
      }
    ]
  }
}
