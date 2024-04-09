package gas.manager.client.app.response;

import java.util.List;

import gas.manager.client.app.model.CustomerModel;

public class CustomerResponse {
    private GenericResponse response;
    private CustomerModel data;
    private List<CustomerModel> listData;

    public CustomerResponse(GenericResponse response) {
        this.response = response;
    }
    public CustomerResponse(GenericResponse response, CustomerModel data) {
        this.response = response;
        this.data = data;
    }

    public CustomerResponse(GenericResponse response, List<CustomerModel> listData) {
        this.response = response;
        this.listData = listData;
    }

    public GenericResponse getResponse() {
        return response;
    }

    public void setResponse(GenericResponse response) {
        this.response = response;
    }

    public CustomerModel getData() {
        return data;
    }

    public void setData(CustomerModel data) {
        this.data = data;
    }

    public List<CustomerModel> getListData() {
        return listData;
    }

    public void setListData(List<CustomerModel> listData) {
        this.listData = listData;
    }
}
