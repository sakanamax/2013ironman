x = "There are #{10} types of people."
binary = "binary"
do_not = "don't"
y = "Those who know #{binary} and those who #{do_not}"

#列印出 x => There are 10 types of people.
puts x
#列印出 y => Those who know binary and those who don't
puts y

#
puts "I said #{x}."
#雙引號裏面是可以執行變數呼叫的,裏面那兩個單引號會被視為符號
puts "I also said: '#{y}'."

hilarious = false
joke_evaluation = "Isn't that joke so funny?! #{hilarious}"

puts joke_evaluation

w = "This is the left side of ..."
e = "a string with a right side."
# 使用 + 符號串接文字
puts w + e
