package org.radwan.events.dao;

import java.math.BigDecimal;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

import org.radwan.events.model.Campaign;
import org.radwan.events.model.Module;
import org.radwan.events.model.Product;
import org.radwan.events.model.Supplier;

public interface CampaignRepository {

	CompletionStage<Stream<Module>> listModules(); 
	CompletionStage<Module> getModule(BigDecimal id);
	CompletionStage<Module> addModule(Module module);
	CompletionStage<Boolean> deleteModule(BigDecimal id);
	
	CompletionStage<Stream<Campaign>> listCampaigns(); 
	CompletionStage<Campaign> getCampaign(BigDecimal id);
	CompletionStage<Campaign> addCampaign(Campaign campaign);
	CompletionStage<Boolean> deleteCampaign(BigDecimal id);
	
	CompletionStage<Stream<Supplier>> listSuppliers(); 
	CompletionStage<Supplier> getSupplier(BigDecimal id);
	CompletionStage<Supplier> addSupplier(Supplier supplier);
	CompletionStage<Boolean> deleteSupplier(BigDecimal id);
	
	CompletionStage<Stream<Product>> listProducts(); 
	CompletionStage<Product> getProduct(BigDecimal id);
	CompletionStage<Product> addProduct(Product product);
	CompletionStage<Boolean> deleteProduct(BigDecimal id);
	
}
