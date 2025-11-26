SELECT vehicles.make, vehicles.model, vehicles.dealership_id, dealerships.name
FROM vehicles
LEFT JOIN dealerships
ON vehicles.dealership_id = dealerships.dealership_id