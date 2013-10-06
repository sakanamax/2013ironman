#定義一個變數 formatter
formatter = "%s %s %s %s"
#帶入相關變數的值, 然後列印出來
puts formatter % [1, 2, 3, 4]
puts formatter % ["one", "two", "three", "four"]
#這邊因為沒有給值, 所以列印4次 %s %s %s %s
puts formatter % [formatter, formatter, formatter, formatter]
#也可以後來帶入值
puts formatter % [
	"I had this thing.",
	"That you could type up right.",
	"But it didn't sing.",
	"So I said goodnight."
]

