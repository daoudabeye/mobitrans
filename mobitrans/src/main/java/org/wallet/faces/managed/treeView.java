package org.wallet.faces.managed;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;
 
@ManagedBean(name="ttBasicView")
@ViewScoped
public class treeView implements Serializable {
     
	private static final long serialVersionUID = 1L;

	private TreeNode root;
	
	private TreeBean selected;
              
    @ManagedProperty("#{treeService}")
    private TreeService service;
     
    @PostConstruct
    public void init() {
        root = service.createDocuments();
    }
 
    public TreeNode getRoot() {
        return root;
    }
 
    public void setService(TreeService service) {
        this.service = service;
    }
 
    public TreeBean getSelected() {
        return selected;
    }
 
    public void setSelected(TreeBean selectedDocument) {
        this.selected = selectedDocument;
    }
}