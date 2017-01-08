package org.wallet.faces.managed;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.wallet.models.Entite;
import org.wallet.services.EntiteService;

@ManagedBean(name = "treeService")
@ApplicationScoped
public class TreeService extends SpringBeanAutowiringSupport {

	@Autowired
	EntiteService entiteService;

	public TreeNode createDocuments() {
		TreeNode root = new DefaultTreeNode(new TreeBean("Files", 0, "Folder"), null);
        
        TreeNode documents = new DefaultTreeNode(new TreeBean("SFP", 0, "Folder"), root);
        TreeNode pictures = new DefaultTreeNode(new TreeBean("Agence", 0, "Folder"), root);
        TreeNode movies = new DefaultTreeNode(new TreeBean("Caisse", 0, "Folder"), root);

		return root;
	}

	private void add(TreeNode nodeParent, List<Entite> entities){
		TreeNode node;
		if(entities != null)
		for(Entite e : entities){
			List<Entite> enfants = e.getEntites();
			int size = enfants == null ? 0 : enfants.size();
			node = new DefaultTreeNode(new TreeBean(e.getNom(), size, e.getType()), nodeParent);
			this.add(node, enfants);
		}
	}
}