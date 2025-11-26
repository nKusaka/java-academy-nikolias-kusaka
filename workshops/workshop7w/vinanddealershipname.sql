SELECT vehicles.vin, dealerships.name, vehicles.dealership_id
FROM vehicles
LEFT JOIN dealerships
ON vehicles.dealership_id = dealerships.dealership_id