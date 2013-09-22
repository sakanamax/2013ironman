# 數字和數學計算
puts "I will now count my chickens"

=begin 
這邊會先印出 Hens 然後換行
顯示 30 => 因為是 25 + 5 (30/6)的結果 / 除法的優先性大於+加法
=end
puts "Hens", 25 + 30 / 6

=begin
這邊會先印出 Roosters 然後換行
顯示 97 => 100 - 3 (75 / 4 的餘數)的結果, 
75 為 25*3 的結果, %為求出餘數, 故 75 除以 4 為 18 餘 3.
=end
puts "Roosters", 100 - 25 * 3 % 4

puts "Now I will count the eggs:"

=begin
這邊會顯示 7 => 3 + 2 + 1 - 5 + 0 - 0 + 6
4 % 2 => 0 餘數為 0 這個部份比較沒有爭議
1 / 4 => 0 這邊其實要注意的是因為沒有宣告為浮點數, 所以只會當成整數來處理, 所以 1 / 4 => 0.25 因為是整數, 所以值為0
=end
puts 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6
# 利用一個小範例來顯示 1/4 的結果
print "print 1/4 result: " 
puts 1/4

puts "Is it true that 3 + 2 < 5 - 7?"

# 因為有 < 符號, 所以會判斷 5 < -2 是否為真
# 故顯示 false
puts 3 + 2 < 5 - 7

puts "What is 3 + 2?", 3 + 2
puts "What is 5 - 7?", 5 - 7

puts "Oh, that's why it's false."

puts "How about some more."

# 這邊是進行邏輯判斷, 我認為把運算式寫入字串顯示會比較好
puts "Is it greater? 5 > -2", 5 > -2
puts "Is it greater or equal? 5 >= -2", 5 >= -2
puts "Is it less or equal? 5 <= -2", 5 <= -2

