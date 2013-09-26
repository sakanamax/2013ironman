cars = 100 #在 11行被引用
space_in_a_car = 4.0 #於第7行運算被引用
drivers = 30 #在12行被引用
passengers =90 #在15行被引用, 於第8行運算被引用
cars_not_driven = cars - drivers #在13行被引用 => 70 (100 - 30)
cars_driven = drivers #於第7行運算被引用, 於第8行運算被引用 => 30
carpool_capacity = cars_driven * space_in_a_car #在14行被引用 => 120 (30 * 4.0)
average_passengers_per_car = passengers / cars_driven #於16行被引用 => 3 (90 / 30)

# 使用 #{cars} 將 cars 變數帶進來
puts "There are #{cars} cars available."
puts "There are only #{drivers} drivers available."
puts "There will be #{cars_not_driven} empty cars today."
puts "We can transport #{carpool_capacity} people today."
puts "We have #{passengers} passengers to carpool today."
puts "We need to put about #{average_passengers_per_car} in each car."
