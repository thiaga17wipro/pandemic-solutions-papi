%dw 2.0
output application/json
var topThree = payload.sessions map (obj,indexOfObj) ->
{
	center: obj.name,
	city: obj.district_name
}
---
topThree [0 to 2]