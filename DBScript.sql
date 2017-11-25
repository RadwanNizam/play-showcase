CREATE DATABASE happens_now WITH OWNER = postgres;

\connect happens_now postgres;

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;
                       

CREATE TABLE public.event
(
  event_id bigint NOT NULL ,
  startDateTime timestamp without time zone,
  title character varying(255) NOT NULL,
  description character varying,
  endDateTime timestamp without time zone,
  url character varying(255),
  CONSTRAINT event_pk PRIMARY KEY (event_id )
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.event
  OWNER TO postgres;