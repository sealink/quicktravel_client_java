### QuickTravel Client Java

## 0.10.2 Unreleased

* [TT-8303] Add support for matching resource id in closest departure finder

## 0.10.1

* [TT-8250] Add masterpoint_resource_id field to resource

## 0.10.0

* [TT-8261] Add masterpoint resource to barcode resource
* [TT-8261] Add resource_id to timetable
* [TT-8252] Fix index out of bounds error when no vessel matches a departure
* [TT-8224] Add Auth API support

## 0.9.0

* [TT-7276] Add support for api/client_token endpoint
* [TT-8144] Add interceptor to allow clients to easily set user agent

## 0.8.1

* [TT-6453] Add support for api/vessels endpoint
* [TT-6473] Add departures `vessel_id` attribute

## 0.8.0

* [TT-5280] Add support for checkout status
* [TT-5541] Fix build on travis
* [TT-6189] Add timetable from_route_stop_id and to_route_stop_id

## 0.7.0

* [TT-4568] Add support for party (person/organisation) creation
* [TT-4573] Add support for on account client creation
* [TT-4699] Add support for new Online Ticket format
* [TT-4700] Add support for issued tickets validate api

## 0.6.1

* [TT-4459] Fix Analytics service definition

## 0.6.0

* [TT-4368] Add support for api/routes endpoint
* [TT-4418] Add support for create/edit scheduled trip endpoints
* [TT-4433] Add network interceptor for CRSF token
* [TT-4429] Fix routes product_type_id parameter
* [TT-4432] Add endpoints for updating and retrieving bookings
* [TT-4435] Add support for checkout endpoint
* [TT-4451] Add support for countries endpoint
* [TT-4452] Add support for tills endpoint
* [TT-4450] Add network interceptor to change tenant hosts
* [TT-4449] Add endpoint to create a new booking
* [TT-4446] Add analytics support
* [TT-4455] Add client search endpoint
* [TT-4453] Expand booking object

## 0.5.0

* [TT-4351] Add new scope parameter to timetable API
* [TT-4352] Expose pricing api/resource parameters

## 0.4.0

* [TT-4238] Add issued_tickets/barcodes endpoint

## 0.3.0

* [TT-4198] Add departure finder for closest time
* [TT-4200] Allow resource categories to be filtered by product_type_ids or ids

## 0.2.0

* [TT-4168] Add API support for Mobile Companion application
* [TT-4182] Add tests for model classes

## 0.1.0

* [TT-3952] Add barcode scanning support
* [TT-4022] Add checkstyle and gradle build linting checks
* [TT-4037] Add coverage and coveralls checks
* [TT-4047] Add deployment script
