package com.BasicSpringFramwork.Basics.XMLconfig;

public class XMLdao {

    // Injecting connection into DAO
    XMLjdbcConnection xmLjdbcConnection; // dependency reference same as AC ref ="";

    public XMLdao(XMLjdbcConnection xmLjdbcConnection) {
        this.xmLjdbcConnection = xmLjdbcConnection;
    }

    public XMLjdbcConnection xmLjdbcConnection(){
        return xmLjdbcConnection;
    }

    public XMLjdbcConnection getXmLjdbcConnection() {
        return xmLjdbcConnection;
    }

    public void setXmLjdbcConnection(XMLjdbcConnection xmLjdbcConnection) {
    }
}
