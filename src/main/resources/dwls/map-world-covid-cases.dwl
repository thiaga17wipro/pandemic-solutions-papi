%dw 2.0
output application/json
---
{
  cases: payload.cases,
  deaths: payload.deaths,
  recovered: payload.recovered,
  active: payload.active
}